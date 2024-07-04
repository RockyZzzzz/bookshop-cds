package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-07-03T07:38:31.308210Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.1 / com.sap.cds:cds4j-api:2.10.1"
)
@CdsName("my.bookshop")
public interface Bookshop_ {
  String CDS_NAME = "my.bookshop";

  Class<Books_> BOOKS = Books_.class;
}
