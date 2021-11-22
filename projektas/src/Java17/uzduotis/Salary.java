package Java17.uzduotis;

import java.time.LocalDate;
import java.util.Date;

public class Salary {
    private Double ismoketasAtlyginimas;
    private LocalDate data;


    public Salary(Double ismoketasAtlyginimas, String data){
        this.ismoketasAtlyginimas = ismoketasAtlyginimas;
        this.data = LocalDate.parse(data);
    }

    public Double getIsmoketasAtlyginimas() {
        return ismoketasAtlyginimas;
    }

    public void setIsmoketasAtlyginimas(Double ismoketasAtlyginimas) {
        this.ismoketasAtlyginimas = ismoketasAtlyginimas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "ismoketasAtlyginimas=" + ismoketasAtlyginimas +
                ", data=" + data +
                '}';
    }
}
