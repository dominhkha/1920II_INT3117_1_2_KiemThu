public class Coach {
    public static void main(String[] args) {

    }
    public static int fareCacultion(int Age, float Distance) throws Exception {
        int fare;
        int new_dist = (int)Distance;

        if(Age <= 0 || Age >200 || Distance <=0 || Distance >100){
            System.out.println("Giá trị đầu vào không hợp lệ!");
            throw new Exception();
        }
        else{
            if(Age < 18){
                if(Age <4){
                    fare = 0;
                }
                else fare = new_dist * 6000;
            }
            else {
                if(Age>=60){
                    if(Distance <= 10) fare = new_dist*8000;
                    else fare = new_dist*6000;
                }
                else {
                    if(Distance <= 10) fare = new_dist*10000;
                    else fare  = new_dist*8000;
                }
            }
        }
        return fare;

    }
}
