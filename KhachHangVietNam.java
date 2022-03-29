package secction5lap2;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
    String[] danhsachdoituong= {"sinh hoạt","kinh doanh","sản xuất"};
    public double dinhmuc(int soluongtieuthu) {
        if (soluongtieuthu < dm[0]) {
            this.thanhtien = soluongtieuthu * 1000;
        } else if (soluongtieuthu < dm[1]) {
            this.thanhtien = 49 * 1000 + (soluongtieuthu - 50) * 1200;
        } else if (soluongtieuthu < dm[2]) {
            this.thanhtien = 49 * 1000 + 50 * 1200 + (soluongtieuthu - 100) * 1500;
        } else if (soluongtieuthu > dm[2]) {
            this.thanhtien = 49 * 1000 + 50 * 1200 + 100 * 1500 + (soluongtieuthu - 200) * 2000;
        }
        return thanhtien;
    }
    String doituongKH;

    public String getDoituongKH() {
        return doituongKH;
    }

    public void setDoituongKH(String doituongKH) {
        this.doituongKH = doituongKH;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        setMaKH(sc.nextLine());
        setHoTen(sc.nextLine());
        setNgayHoaDon(sc.nextLine());
        setDoituongKH(this.danhsachdoituong[sc.nextInt()]);
        setSoluong(sc.nextInt());
    }
    public void print(){
        System.out.println(getMaKH());
        System.out.println(getHoTen());
        System.out.println(getNgayHoaDon());
        System.out.println(getDoituongKH());
        System.out.println(getSoluong());

    }
}
