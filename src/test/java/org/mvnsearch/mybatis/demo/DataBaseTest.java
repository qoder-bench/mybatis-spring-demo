package org.mvnsearch.mybatis.demo;

import com.github.database.rider.core.api.dataset.DataSet;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.io.FileOutputStream;

public class DataBaseTest extends ProjectBaseTest {

    @Test
    @DataSet(value = "db/datasets/lego-set.xml")
    public void testLoadData() {

    }

    @Test
    public void testDTDGeneration(@Autowired DataSource dataSource) throws Exception {
        DatabaseConnection databaseConnection = new DatabaseConnection(dataSource.getConnection());
        FlatDtdDataSet.write(databaseConnection.createDataSet(), new FileOutputStream("target/database.dtd"));
    }
}
