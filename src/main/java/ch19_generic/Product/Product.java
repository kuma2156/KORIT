package ch19_generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/*
      @Data를 해서 만들 수 있다. 다양한 방법으로 해결할 수 있다.

* */
@AllArgsConstructor
@ToString
public class Product <T>{
    private String productName;
    private T productInfo;

}
