package script.db

databaseChangeLog(logicalFilePath: 'script/db/owngroovy.groovy') {
    changeSet(author: 'ougen',id: '2019-07-31-owngroovy'){
        createTable(tableName: 'groovy_demo'){
            column(name: 'id',type: 'BIGINT UNSIGNED',autoIncrement: true,remarks: '表ID，主键，供其他表做外键'){
                constraints(primaryKey: true,primaryKeyName: 'PK_SERVICE')
            }
            column(name: 'name',type: 'varchar(10)'){
                constraints(nullable: true,unique: true)
            }
        }
    }
    changeSet(author: 'ougen',id: '2019-07-31-update'){
        addColumn(tableName: 'groovy_demo'){
            column(name: 'age',type: 'tinyint',defaultValue: 10)
        }
    }
}