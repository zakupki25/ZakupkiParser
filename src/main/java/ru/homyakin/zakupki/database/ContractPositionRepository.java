package ru.homyakin.zakupki.database;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.homyakin.zakupki.models._223fz.contract.PositionType;
import ru.homyakin.zakupki.utils.RepositoryUtils;

@Component
public class ContractPositionRepository {
    private static final Logger logger = LoggerFactory.getLogger(ContractPositionRepository.class);
    private final JdbcTemplate jdbcTemplate;
    private final RepositoryUtils repositoryUtils;
    private final ClassifierService classifierService;

    public ContractPositionRepository(
        DataSource dataSource,
        RepositoryUtils repositoryUtils,
        ClassifierService classifierService
    ) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.repositoryUtils = repositoryUtils;
        this.classifierService = classifierService;
    }

    public void insert(PositionType position, String contractGuid) {
        String sql = "INSERT INTO zakupki.contract_position (contract_guid, ordinal_number, guid," +
            "name, okdp_code, okdp_name, okpd_code, okpd_name, okpd2_code, okpd2_name, country_code," +
            "producer_country, impossible_to_determine_attr, okei_code, okei_name, qty)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            jdbcTemplate.update(
                sql,
                contractGuid,
                position.getOrdinalNumber(),
                position.getGuid(),
                repositoryUtils.removeExtraSpaces(position.getName()),
                classifierService.getClassifierCode(position.getOkdp()),
                classifierService.getClassifierName(position.getOkdp()),
                classifierService.getClassifierCode(position.getOkpd()),
                classifierService.getClassifierName(position.getOkpd()),
                classifierService.getClassifierCode(position.getOkpd2()),
                classifierService.getClassifierName(position.getOkpd2()),
                repositoryUtils.getCountryCode(position.getCountry()),
                repositoryUtils.convertBoolean(position.isProducerCountry()),
                repositoryUtils.convertBoolean(position.isImpossibleToDetermineAttr()),
                classifierService.getClassifierCode(position.getOkei()),
                classifierService.getClassifierName(position.getOkei()),
                position.getQty()
            );
        } catch (RuntimeException e) {
            logger.error("Internal database error", e);
        }
    }
}
