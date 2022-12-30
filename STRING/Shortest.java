public class Shortest {

    public static void main(String[] args) {
        String path = "WNENESENNN";
        System.out.println(path.substring(0,4));
        int si=0,ei=4;
        String str=" ";
        for(int i=si; i<ei; i++)
        {
            str+=path.charAt(i);
        }
        System.out.println("2nd one"+str);
        
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            }

            else if (dir == 'S') {
                y--;
            }

            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        float f = (float) Math.sqrt(x2 + y2);
        System.out.println(f);

    }
}