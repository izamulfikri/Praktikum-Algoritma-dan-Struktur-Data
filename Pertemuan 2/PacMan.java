import java.util.Scanner;
public class PacMan {

    int x, y, width=20, height=40;

    void moveLeft() {
        if (x > 0) x--;
    }

    void moveRight() {
        if (x < width || !(x >= width)) x++;
    }

    void moveUp() {
        if (y > 0) y--;  
    }

    void moveDown() {
        if (y < height || !(x >= height)) y++;
    }
    void printPosition() {
        System.out.println("current possition: x " + x + " y " + y);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print(": ");
                } else if (j == 0 || j == width - 1) {
                    System.out.print(": ");
                } else {
                    if (!(i == y && j == x)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("v ");
                    }

                }
            }         System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        PacMan pc = new PacMan();
        System.out.println("=============");

                pc.x = 1;
                pc.y = 1;

        do {
            System.out.println("===============");
            System.out.print("w untuk move up\n"
                    + "a untuk move left\n"
                    + "s untuk move down\n"
                    + "d untuk move right\n"
                    + "p untuk print current possition\n"
                    + "=> ");
            char opsi = userInput.next().charAt(0);
            switch (opsi) {
                case 'w':
                    pc.moveUp();
                    break;
                case 'a':
                    pc.moveLeft();
                    break;
                case 's':
                    pc.moveDown();
                    break;
                case 'd':
                    pc.moveRight();
                    break;
                case 'p':
                    pc.printPosition();
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        } while (true);
    }
}

