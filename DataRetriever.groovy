import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.Optional

public class DataRetriveUtil extends ExtendM3Utility {
  public Optional<String> getField(MIAPI mi, String fieldName) {

// ...

}

  
public boolean isDateValid(int dateNum) {
  //isSentParam
  //checkParam
    String date = dateNum.toString();
    try {
      LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyymmdd"));
      return true;
    } catch (DateTimeParseException e) {
      return false;
    }
  }
}
