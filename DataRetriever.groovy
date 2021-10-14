import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.Optional

public class DataRetriveUtil extends ExtendM3Utility {
  
    private Optional boolean <String> getField(MIAPI mi, String fieldName) {
        if(mi.in(fieldName).isPresent()){
            return true;
        }
        .orElseThrow( () -> new IsNullExeption("Is null"));

    public Optional<String> ofNullable validateStringType(MIAPI, String getField){
        
        if (mi.inData(fieldName).isBlank() || mi.inData(fieldName).equals("?")){
            return Optional.of(String "")
        }
        else{
            return Optional.of(String mi.inData(fieldName))
        }
    }

    public Optional<String> ofNullable validateNumericalType(MIAPI, String getField){
        int numField = Integer.parseInt(getField)
        if (mi.inData(fieldName).isBlank() || mi.inData(fieldName).equals("?")){
            return Optional.of(Integer "0")
        }
        else{
            return Optional.of(Integer mi.inData(fieldName))
        }
    }

    public boolean isDateValid(String mi.inData(fieldName)) {
        String date = dateNum.toString();
        try {
        LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyymmdd"));
        return true;
        }  catch (DateTimeParseException e) {
        return false;
        }
    }
}
