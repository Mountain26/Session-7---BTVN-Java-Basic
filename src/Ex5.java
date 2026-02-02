public class Ex5 {
    public static void main(String[] args) {
        double score = 8.5;
        System.out.println("Điểm: " + score);
        System.out.println("Điểm tối đa: " + Config.max);
        System.out.println("Điểm tối thiểu: " + Config.min);
        if (score >= Config.min && score <= Config.max) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}
class Config {
    public static final double max = 10.0;
    public static final double min = 0.0;
}