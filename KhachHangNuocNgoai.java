package secction5lap2;

import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
    String QuocTich;

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }

    public int dinhmuc(int soluongtieuthu){
        if(soluongtieuthu<dm[0]){
            this.thanhtien=soluongtieuthu*1000;
        }else if(soluongtieuthu<=dm[1]){
            this.thanhtien=soluongtieuthu*1200;
        }else if(soluongtieuthu<=dm[2]){
            this.thanhtien=soluongtieuthu*1500;
        }else{
            this.thanhtien=soluongtieuthu*2000;
        }
        return thanhtien;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        setMaKH(sc.nextLine());
        setHoTen(sc.nextLine());
        setNgayHoaDon(sc.nextLine());
        setQuocTich(sc.nextLine());
        setSoluong(sc.nextInt());
    }
    public void print(){
        System.out.println(getMaKH());
        System.out.println(getHoTen());
        System.out.println(getNgayHoaDon());
        System.out.println(getQuocTich());
        System.out.println(getSoluong());

    }

}
