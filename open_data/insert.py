import pymysql
from pymysql.cursors import DictCursor
import json


def insert(table: str, columns: list, json_fields: list):
    connection = pymysql.connect(
        host='localhost',
        user='root',
        password='12345',
        db='zakupki',
        charset='utf8mb4',
        cursorclass=DictCursor
    )
    print(f'Inserting {table}')
    with open(f'data/{table}.json') as json_file:
        data = json.load(json_file)
        for i in data:
            try:
                with connection.cursor() as cursor:
                    s = ", ".join(columns)
                    template = ', '.join(['%s' for _ in range(len(columns))])
                    sql = f'INSERT INTO zakupki.{table} ({s}) VALUES ({template})'
                    fields = [str(i[j]).lower() for j in json_fields]
                    cursor.execute(sql, fields)
                    connection.commit()
            except Exception as e:
                print(e)

    connection.close()