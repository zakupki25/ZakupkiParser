# ZakupkiParser
Парсер для http://zakupki.gov.ru/

На данный момент реализована выгрузка планов закупки с ftp сервера.

## Инструкция по запуску

### Настройка базы данных

В данной программе используется база данных MySQL и есть два способа ее настройки:
<ol>
<li>Стандартный</li>
<li>Docker</li>
</ol>

#### 1. Стандартный способ
Устанавливаем базу данных MySQL обычном способом. В интернете есть много инструкций для этого. <br>

**ВАЖНО!** Пароль для пользователя root должен быть 12345. <br>
В противном случае заходим в файл src/main/resources/application.yml и меняем 12345 на свой пароль.<br>

После установки необходимо подключиться к базе данных и выполнить скрипт из файла database/docker/sql/script.sql

#### 2. Docker (только для тех, кто знает что это)
Заходим в папку database/docker и запускаем файл docker.sh.

### Запуск парсера
<br>
Открываем проект в вашей среде разработки (Я рекомендую IntelliJ IDEA от Jetbrains) и настраиваем проект Maven
(IntelliJ IDEA скорее всего сделает это самостоятельно при открытие папки с проектом).<br>
Все что вам остается это зайти в src/main/java/ru/homyakin/zakupki/Application.java и запустить программу.
 
 ### Итог
 На данный момент выгрузка происходит единоразово и со всех регионов по очереди, поэтому это займет **ОЧЕНЬ** много
 времени.
