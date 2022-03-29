package secction5lap2;

import java.util.ArrayList;

public class DSKH {
    public ArrayList<KhachHangVietNam>  DSKHVN = new ArrayList<>();
    public ArrayList<KhachHangNuocNgoai> DSKHNN = new ArrayList<>();

    public void tongVN(){
        int tong=1;
        for(KhachHangVietNam p:DSKHVN){
            tong = tong + p.soluong;
        }
        System.out.println(tong);
    }
    public void tongNN(){
        int tong = 0;
        for (KhachHangNuocNgoai p:DSKHNN){
            tong = tong + p.soluong;
        }
        System.out.println(tong);
    }
    public void aveKHNN() {
        float tong = 0;
        float trungbinh = 0;
        for (KhachHangNuocNgoai p : DSKHNN) {
            tong = p.dinhmuc(p.soluong);
        }
        trungbinh = tong / DSKHNN.size();
        System.out.println(trungbinh);
    }
}
