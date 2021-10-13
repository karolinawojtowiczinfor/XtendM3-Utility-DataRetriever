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

    public Optional<String> ofNullable validateInput(MIAPI, String getField){
        
        if (mi.inData(fieldName).isBlank()) || (mi.inData(fieldName).equals(0)){
            return Optional.of()
        }

        for (mi.inData(fieldName).equals("?")){
            if (mi.inData(fieldName)instanceof String){
                return Optional.of(String "")
            }
            else {
                return Optional.of(Integer "0")
            }
        }
        if (mi.inData(fieldName) instanceof String) {
            return Optional.of(String mi.inData(fieldName))
        }

    }

    public boolean isDateValid(int dateNum) {
        String date = dateNum.toString();
        try {
        LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyymmdd"));
        return true;
        }  catch (DateTimeParseException e) {
        return false;
        }
    }
}
