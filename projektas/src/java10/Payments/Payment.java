package java10.Payments;

public interface Payment {
String getBankAccount();
double getAmount();

default double paymentSum(double[] payments){
    double sum = 0;
    for( int i = 0; i < payments.length; i++){
        sum+= payments[i];
    }
    return sum;
}
}
