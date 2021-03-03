package com.gourianova.apptrainer.dao.impl;

import com.gourianova.apptrainer.ExchangeDB;
import com.gourianova.apptrainer.dao.PersonReader;
import com.gourianova.apptrainer.dao.Sevice.Parser;
import com.gourianova.apptrainer.dao.Sevice.Reader;
import com.gourianova.apptrainer.dao.Sevice.deserializationFromFileType;
import com.gourianova.apptrainer.dao.XMLDto;
import com.gourianova.apptrainer.entity.Node;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import static com.gourianova.apptrainer.ExchangeDB.DB_URL;

public class SetDataBase {
    public SetDataBase() throws IOException,SQLException, ClassNotFoundException  {
        Reader read = new com.gourianova.apptrainer.dao.Sevice.Reader();


    PersonReader personReader = new PersonReader(deserializationFromFileType.XML);
    XMLDto dto = personReader.getXMLDto();
    String text = dto.getText();
    read.readXMLFile(text);
    //TODO:  from System.out to persons.txt

        System.out.println("\n");
        for (Node nodes : Parser.getNodeList()) {
            if (nodes.getContent() != null) {
                System.out.println(nodes.getContent() + "\n");
            }
        }



        List<String> allLines = read.readTXTFile("persons.txt");

            ExchangeDB db = new ExchangeDB();
            db.createTablesAndForeignKeys();

            db.setExchangeDB();
            String sql = "INSERT INTO user_table ( email, password, u_create_time,max_resul) VALUES (Tatiana,qwe,8,9)";
//c id нестыковка
            try (Connection connection = DriverManager.getConnection(DB_URL)) {
                Statement statement = connection.createStatement();


                int rowsAffected = statement.executeUpdate(sql);
                sql = "INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (443,3,4,5)";
                rowsAffected = rowsAffected + statement.executeUpdate(sql);
                System.out.println(rowsAffected + "!?!!");
           //     connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }


    }


