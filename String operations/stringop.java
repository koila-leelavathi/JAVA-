import java.lang.String;
class stringop
{
 public static void main(String[] args)
 {
 String s1="Hello";
 System.out.println(s1);
 //substring
 String s2="leela";
 String w=s2.substring(2,4);
 System.out.println(w);
 //concatenation
 String a="leela";
 String b="vathi";
 System.out.println(a.concat(b));
 System.out.println(a+b);
 //compare
 String c="leela";
 String d="leela";
 System.out.println(c.compareTo(d));
 System.out.println(c.compareToIgnoreCase(d));
 //equals
 String e="leela";
 String f="leela";
 System.out.println(e.equals(f));
 //equalsingnore
 String g="leela";
 String h="leela";
 System.out.println(g.equalsIgnoreCase(h));
 //stringupper
 String i="leela";
 System.out.println(i.toUpperCase());
 //stringlower
 String j="leela";
 System.out.println(j.toLowerCase());
 //replace
 String k="leela";
 System.out.println(k.replace('l','L'));
 //replace first charecter
 String l="leela";
 System.out.println(l.replaceFirst("le","Le"));
 //indexof
 String m="leela";
 System.out.println(m.indexOf('a'));
 //last index
 String n="leela";
 System.out.println(n.lastIndexOf('e'));
 //starts with
 String o="leela";
 System.out.println(o.startsWith("le"));
 //ends with
 String p="leela";
 System.out.println(p.endsWith("le"));
}
}
 
 