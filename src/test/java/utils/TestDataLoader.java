//package utils;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import smoke.test.Registration.Data.TestData;
//
//import java.io.File;
//import java.io.IOException;
//
//public class TestDataLoader {
//  public static TestData loadFromJson(String path) throws IOException {
//    ObjectMapper mapper = new ObjectMapper();
//    return mapper.readValue(new File(path), TestData.class);
//  }
//}
