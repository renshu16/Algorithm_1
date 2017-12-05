package rensq.algs.week1;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by rensq on 2017/12/4.
 */
public class SocialNetworkConnQU {

    int num;
    FileInputStream ins;
    QuickFindWeightQU qu;

    public SocialNetworkConnQU(int num, FileInputStream ins){
        this.num = num;
        this.ins = ins;
        qu = new QuickFindWeightQU(num);
    }

    public String getEarliestConTime(){
        String earliestConTime = null;
        Scanner scanner = new Scanner(ins,"utf-8");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line != null && !line.trim().equals("")){
                String[] lineArr = line.split(" ");
                if (lineArr.length == 3){
                    String timestamp = lineArr[0];
                    int p = Integer.parseInt(lineArr[1]);
                    int q = Integer.parseInt(lineArr[2]);
                    if (qu.connected(p,q)) continue;
                    qu.union(p,q);
                    if (qu.count() == 1){
                        earliestConTime = timestamp;
                        break;
                    }
                }
            }
        }

        return earliestConTime;
    }
}
