package job;

import java.util.Scanner;

public class Beike2 {
    static class Gamer {
        int hp;
        int damage;
        int cd;
        int currentCd;

        boolean isDead() {
            return hp <= 0;
        }

        boolean isCDReady() {
            return currentCd == 0;
        }

        void clear() {
            hp = 0;
            damage = 0;
            cd = 0;
            currentCd = 0;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Gamer xiaozhi = new Gamer(), xiaochun = new Gamer();
        for (int i = 0; i < n; i++) {
            xiaozhi.hp = scanner.nextInt();
            xiaozhi.damage = scanner.nextInt();
            xiaozhi.cd = scanner.nextInt() - 1;
            xiaochun.hp = scanner.nextInt();
            xiaochun.damage = scanner.nextInt();
            xiaochun.cd = scanner.nextInt() - 1;
            playGame(xiaozhi, xiaochun);
            xiaozhi.clear();
            xiaochun.clear();
        }
    }

    static void playGame(Gamer xiaozhi, Gamer xiaochun) {
        while (!xiaozhi.isDead() && !xiaochun.isDead()) {
            if (xiaozhi.isCDReady()) {
                xiaochun.hp -= xiaozhi.damage;
                xiaozhi.currentCd = xiaozhi.cd;
            } else {
                xiaozhi.currentCd--;
            }

            if (xiaochun.isCDReady()) {
                xiaozhi.hp -= xiaochun.damage;
                xiaochun.currentCd = xiaochun.cd;
            } else {
                xiaochun.currentCd--;
            }
        }

        if (xiaozhi.isDead() && xiaochun.isDead()) {
            System.out.println("TIE");
        } else if (xiaochun.isDead()) {
            System.out.println("XIAOZHI");
        } else {
            System.out.println("XIAOCHUN");
        }
    }
}

/**
 * 4
 * 1 2 3 4 5 6
 * 128 39 20 109 100 92
 * 1000 10 39 33 333 39
 * 101 10 10 101 20 20
 */
