package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("CatalogService.Books")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-07-03T07:38:31.308210Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.1 / com.sap.cds:cds4j-api:2.10.1"
)
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "CatalogService.Books";

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();
}
