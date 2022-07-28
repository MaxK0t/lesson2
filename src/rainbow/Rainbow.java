package rainbow;

public class Rainbow {
    String r = "Red";           //1
    String o = "Orange";        //2
    String y = "Yellow";        //3
    String g = "Gren";          //4
    String lb = "Light Blue";   //5
    String b = "Blue";          //6
    String p = "Purple";        //7

    String rr = r + "-" + r;    //8
    String ro = r + "-" + o;    //9
    String ry = r + "-" + y;    //10
    String rg = r + "-" + g;    //11
    String rlb = r + "-" + lb;  //12
    String rb = r + "-" + b;    //13
    String rp = r + "-" + p;    //14

    String oo = o + "-" + o;    //15
    String or = o + "-" + r;    //16
    String oy = o + "-" + y;    //17
    String og = o + "-" + g;    //18
    String olb = o + "-" + lb;  //19
    String ob = o + "-" + b;    //20
    String op = o + "-" + p;    //21

    String yy = y + "-" + y;    //22
    String yr = y + "-" + r;    //23
    String yo = y + "-" + o;    //24
    String yg = y + "-" + g;    //25
    String ylb = y + "-" + lb;  //26
    String yb = y + "-" + b;    //27
    String yp = y + "-" + p;    //28

    String gg = g + "-" + g;    //29
    String gr = g + "-" + r;    //30
    String gy = g + "-" + y;    //31
    String go = g + "-" + o;    //32
    String glb = g + "-" + lb;  //33
    String gb = g + "-" + b;    //34
    String gp = g + "-" + p;    //35

    String lblb = lb + "-" + lb;//36
    String lbr = lb + "-" + r;  //37
    String lby = lb + "-" + y;  //38
    String lbg = lb + "-" + g;  //39
    String lbo = lb + "-" + o;  //40
    String lbb = lb + "-" + b;  //41
    String lbp = lb + "-" + p;  //42

    String bb = b + "-" + b;    //43
    String br = b + "-" + r;    //44
    String by = b + "-" + y;    //45
    String bg = b + "-" + g;    //46
    String bo = b + "-" + o;    //47
    String blb = b + "-" + lb;  //48
    String bp = b + "-" + p;    //49

    String pp = p + "-" + p;    //50
    String pr = p + "-" + r;    //51
    String py = p + "-" + y;    //52
    String pg = p + "-" + g;    //53
    String po = p + "-" + o;    //54
    String pb = p + "-" + b;    //55
    String plb = p + "-" + lb;  //56


    int i;

    public void setColor(int num) {
        i = num;
    }

    public void getColor1() {
        if (i == 1) {
            System.out.println(r);
        } else if (i == 2) {
            System.out.println(o);
        } else if (i == 3) {
            System.out.println(y);
        } else if (i == 4) {
            System.out.println(g);
        } else if (i == 5) {
            System.out.println(lb);
        } else if (i == 6) {
            System.out.println(b);
        } else if (i == 7) {
            System.out.println(p);
        }
    }

    public void getColor2() {
        switch (i) {
            case 8:
                System.out.println(rr);
                break;
            case 9:
                System.out.println(ro);
                break;
            case 10:
                System.out.println(ry);
                break;
            case 11:
                System.out.println(rg);
                break;
            case 12:
                System.out.println(rlb);
                break;
            case 13:
                System.out.println(rb);
                break;
            case 14:
                System.out.println(rp);
                break;

            case 15:
                System.out.println(oo);
                break;
            case 16:
                System.out.println(or);
                break;
            case 17:
                System.out.println(oy);
                break;
            case 18:
                System.out.println(og);
                break;
            case 19:
                System.out.println(olb);
                break;
            case 20:
                System.out.println(ob);
                break;
            case 21:
                System.out.println(op);
                break;

            case 22:
                System.out.println(yy);
                break;
            case 23:
                System.out.println(yr);
                break;
            case 24:
                System.out.println(yo);
                break;
            case 25:
                System.out.println(yg);
                break;
            case 26:
                System.out.println(ylb);
                break;
            case 27:
                System.out.println(yb);
                break;
            case 28:
                System.out.println(yp);
                break;

            case 29:
                System.out.println(gg);
                break;
            case 30:
                System.out.println(gr);
                break;
            case 31:
                System.out.println(gy);
                break;
            case 32:
                System.out.println(go);
                break;
            case 33:
                System.out.println(glb);
                break;
            case 34:
                System.out.println(gb);
                break;
            case 35:
                System.out.println(gp);
                break;

            case 36:
                System.out.println(lblb);
                break;
            case 37:
                System.out.println(lbr);
                break;
            case 38:
                System.out.println(lby);
                break;
            case 39:
                System.out.println(lbg);
                break;
            case 40:
                System.out.println(lbo);
                break;
            case 41:
                System.out.println(lbb);
                break;
            case 42:
                System.out.println(lbp);
                break;

            case 43:
                System.out.println(bb);
                break;
            case 44:
                System.out.println(br);
                break;
            case 45:
                System.out.println(by);
                break;
            case 46:
                System.out.println(bg);
                break;
            case 47:
                System.out.println(bo);
                break;
            case 48:
                System.out.println(blb);
                break;
            case 49:
                System.out.println(bp);
                break;

            case 50:
                System.out.println(pp);
                break;
            case 51:
                System.out.println(pr);
                break;
            case 52:
                System.out.println(py);
                break;
            case 53:
                System.out.println(pg);
                break;
            case 54:
                System.out.println(po);
                break;
            case 55:
                System.out.println(pb);
                break;
            case 56:
                System.out.println(plb);
                break;
            default:
                System.out.println("Try again");
        }
    }

}


