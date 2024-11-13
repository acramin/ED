import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Local a = new Local("Bloco A",1700, 420);
        Local b = new Local("Bloco B",1630,380);
        Local c = new Local("Bloco C",1540,350);
        Local d = new Local("Bloco D",1470, 320);
        Local e = new Local("Bloco E",1390, 260);
        Local f = new Local("Bloco F",1170, 210);
        Local g = new Local("Bloco G", 950, 220);
        Local h = new Local("Bloco H", 1200, 690);
        Local h2 = new Local("Extensão do H (backrooms)", 1280,530);
        Local i = new Local("Bloco I", 268, 529);
        Local j = new Local("Bloco J", 226, 428);
        Local l = new Local("Bloco L",1660, 150);
        Local m = new Local("Bloco M",750,30);
        Local n = new Local("Bloco N",1600,180);
        Local p = new Local("Bloco P", 1100, 340);
        Local q = new Local("Bloco Q", 900, 350);
        Local r = new Local("Bloco R", 330, 690);
        Local s = new Local("Bloco S", 1676, 650);
        Local u = new Local("Bloco U", 1140, 530);
        Local portaria = new Local("Portaria", 575, 1035);
        Local v = new Local("Bloco V", 925, 632 );
        Local w = new Local("Bloco W", 1470, 500);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Local ca = new Local("CA",1370,130);
        Local ginasio = new Local("Ginásio", 384, 315);

        Rota rota1 = new Rota(w, s);
        Rota rota1_inv = new Rota(s, w);
        
        Rota rota2 = new Rota(ginasio, j);
        Rota rota2_inv = new Rota(j, ginasio);
        
        Rota rota3 = new Rota(j, i);
        Rota rota3_inv = new Rota(i, j);
        
        Rota rota4 = new Rota(i, r);
        Rota rota4_inv = new Rota(r, i);
        
        Rota rota5 = new Rota(r, v);
        Rota rota5_inv = new Rota(v, r);
        
        Rota rota6 = new Rota(r, portaria);
        Rota rota6_inv = new Rota(portaria, r);
        
        Rota rota7 = new Rota(portaria, h);
        Rota rota7_inv = new Rota(h, portaria);
        
        Rota rota8 = new Rota(portaria, v);
        Rota rota8_inv = new Rota(v, portaria);
        
        Rota rota9 = new Rota(s, a);
        Rota rota9_inv = new Rota(a, s);
        
        Rota rota10 = new Rota(v, u);
        Rota rota10_inv = new Rota(u, v);
        
        Rota rota11 = new Rota(v, h);
        Rota rota11_inv = new Rota(h, v);
        
        Rota rota12 = new Rota(v, q);
        Rota rota12_inv = new Rota(q, v);
        
        Rota rota13 = new Rota(u, h2);
        Rota rota13_inv = new Rota(h2, u);
        
        Rota rota14 = new Rota(ginasio, g);
        Rota rota14_inv = new Rota(g, ginasio);
        
        Rota rota15 = new Rota(ginasio, q);
        Rota rota15_inv = new Rota(q, ginasio);
        
        Rota rota16 = new Rota(q, p);
        Rota rota16_inv = new Rota(p, q);
        
        Rota rota17 = new Rota(h2, h);
        Rota rota17_inv = new Rota(h, h2);
        
        Rota rota18 = new Rota(h, w);
        Rota rota18_inv = new Rota(w, h);
        
        Rota rota19 = new Rota(g, f);
        Rota rota19_inv = new Rota(f, g);
        
        Rota rota20 = new Rota(f, e);
        Rota rota20_inv = new Rota(e, f);
        
        Rota rota21 = new Rota(e, d);
        Rota rota21_inv = new Rota(d, e);
        
        Rota rota22 = new Rota(d, c);
        Rota rota22_inv = new Rota(c, d);
        
        Rota rota23 = new Rota(c, b);
        Rota rota23_inv = new Rota(b, c);
        
        Rota rota24 = new Rota(b, a);
        Rota rota24_inv = new Rota(a, b);
        
        Rota rota25 = new Rota(e, n);
        Rota rota25_inv = new Rota(n, e);
        
        Rota rota26 = new Rota(d, n);
        Rota rota26_inv = new Rota(n, d);
        
        Rota rota27 = new Rota(ca, l);
        Rota rota27_inv = new Rota(l, ca);
        
        Rota rota28 = new Rota(f, ca);
        Rota rota28_inv = new Rota(ca, f);
        
        Rota rota29 = new Rota(ca, e);
        Rota rota29_inv = new Rota(e, ca);
        
        Rota rota30 = new Rota(p, g);
        Rota rota30_inv = new Rota(g, p);
        
        Rota rota31 = new Rota(p, f);
        Rota rota31_inv = new Rota(f, p);
        
        Rota rota32 = new Rota(p, u);
        Rota rota32_inv = new Rota(u, p);
        
        Rota rota33 = new Rota(h, u);
        Rota rota33_inv = new Rota(u, h);
        
        Rota rota34 = new Rota(p, h2);
        Rota rota34_inv = new Rota(h2, p);
        
        Rota rota35 = new Rota(h2, w);
        Rota rota35_inv = new Rota(w, h2);
        
        Rota rota36 = new Rota(w, a);
        Rota rota36_inv = new Rota(a, w);
        
        Rota rota37 = new Rota(w, b);
        Rota rota37_inv = new Rota(b, w);
        
        Rota rota38 = new Rota(w, c);
        Rota rota38_inv = new Rota(c, w);
        
        Rota rota39 = new Rota(w, d);
        Rota rota39_inv = new Rota(d, w);
        
        Rota rota40 = new Rota(w, e);
        Rota rota40_inv = new Rota(e, w);
        
        Rota rota41 = new Rota(p, e);
        Rota rota41_inv = new Rota(e, p);
        
        Rota rota42 = new Rota(g, q);
        Rota rota42_inv = new Rota(q, g);
        
        Rota rota43 = new Rota(m, g);
        Rota rota43_inv = new Rota(g, m);
        
        Rota rota44 = new Rota(h, s);
        Rota rota44_inv = new Rota(s, h);
        
        Rota rota45 = new Rota(e, h2);
        Rota rota45_inv = new Rota(h2, e);
        
        Rota rota46 = new Rota(m, ginasio);
        Rota rota46_inv = new Rota(ginasio, m);
        





        // Rota rota3 = new Rota(c, d);
        // Rota rota4 = new Rota(d, e);
        // Rota rota5 = new Rota(a, d);
        // Rota rota6 = new Rota(f, a);
        
        mapa.addNo(a); mapa.addNo(b); mapa.addNo(c); mapa.addNo(d); mapa.addNo(e); mapa.addNo(f); mapa.addNo(g); mapa.addNo(h); mapa.addNo(h2); mapa.addNo(i); mapa.addNo(j); mapa.addNo(l); mapa.addNo(m); mapa.addNo(n); mapa.addNo(p); mapa.addNo(q); mapa.addNo(r); mapa.addNo(s); mapa.addNo(u); mapa.addNo(v); mapa.addNo(w); mapa.addNo(ginasio); mapa.addNo(portaria); mapa.addNo(ca); 
        
        mapa.addRota(rota1); mapa.addRota(rota2); mapa.addRota(rota3); mapa.addRota(rota4); mapa.addRota(rota5); mapa.addRota(rota6); mapa.addRota(rota7);mapa.addRota(rota8);mapa.addRota(rota9);mapa.addRota(rota10);mapa.addRota(rota11);mapa.addRota(rota12);mapa.addRota(rota13);mapa.addRota(rota14);mapa.addRota(rota15);mapa.addRota(rota16);mapa.addRota(rota17);mapa.addRota(rota18);mapa.addRota(rota19);mapa.addRota(rota20);mapa.addRota(rota21);mapa.addRota(rota22);mapa.addRota(rota23);mapa.addRota(rota24);mapa.addRota(rota25);mapa.addRota(rota26);mapa.addRota(rota27);mapa.addRota(rota28);mapa.addRota(rota29);mapa.addRota(rota30);mapa.addRota(rota31);mapa.addRota(rota32);mapa.addRota(rota33);mapa.addRota(rota34);mapa.addRota(rota35);mapa.addRota(rota36);mapa.addRota(rota37);mapa.addRota(rota38);mapa.addRota(rota39);mapa.addRota(rota40);mapa.addRota(rota41);mapa.addRota(rota42);mapa.addRota(rota43);mapa.addRota(rota44);mapa.addRota(rota45);mapa.addRota(rota46);mapa.addRota(rota1_inv);mapa.addRota(rota2_inv);mapa.addRota(rota3_inv);mapa.addRota(rota4_inv);mapa.addRota(rota5_inv);mapa.addRota(rota6_inv);mapa.addRota(rota7_inv);mapa.addRota(rota8_inv);mapa.addRota(rota9_inv);mapa.addRota(rota10_inv);mapa.addRota(rota11_inv);mapa.addRota(rota12_inv);mapa.addRota(rota13_inv);mapa.addRota(rota14_inv);mapa.addRota(rota15_inv);mapa.addRota(rota16_inv);mapa.addRota(rota17_inv);mapa.addRota(rota18_inv);mapa.addRota(rota19_inv);mapa.addRota(rota20_inv);mapa.addRota(rota21_inv);mapa.addRota(rota22_inv);mapa.addRota(rota23_inv);mapa.addRota(rota24_inv);mapa.addRota(rota25_inv);mapa.addRota(rota26_inv);mapa.addRota(rota27_inv);mapa.addRota(rota28_inv);mapa.addRota(rota29_inv);mapa.addRota(rota30_inv);mapa.addRota(rota31_inv);mapa.addRota(rota32_inv);mapa.addRota(rota33_inv);mapa.addRota(rota34_inv);mapa.addRota(rota35_inv);mapa.addRota(rota36_inv);mapa.addRota(rota37_inv);mapa.addRota(rota38_inv);mapa.addRota(rota39_inv);mapa.addRota(rota40_inv);mapa.addRota(rota41_inv);mapa.addRota(rota42_inv);mapa.addRota(rota43_inv);mapa.addRota(rota44_inv);mapa.addRota(rota45_inv);mapa.addRota(rota46_inv);


        
        



        

        Mapa.Resultado resultado =  mapa.calculaMenorDistancia(portaria, portaria);
        TelaGrafo tela = new TelaGrafo(mapa, resultado);
        System.out.println(resultado);


        
        
        
    }
}
