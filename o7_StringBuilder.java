public class o7_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Display all methods applicable in the sb
        
        // append() method
        sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        // charat
        System.out.println(sb.charAt(5)); // F
        
        // length() method
        System.out.println(sb.length()); // 26
        
        // indexOf() method
        System.out.println(sb.indexOf("CD")); // 2
        
        // lastIndexOf() method
        System.out.println(sb.lastIndexOf("WX")); // 17
        
        // replace() method
        sb.replace(0, 5, "Goodbye");
        
        // setCharAt() method
        sb.setCharAt(5, '*');
        
        // substring() method
        System.out.println(sb.substring(6)); // Goodbye World
        
        // deleteCharAt() method
        sb.deleteCharAt(10);
        
        // delete() method
        sb.delete(6, 10);
        
        // reverse() method
        sb.reverse();
        
        // toString() method
        System.out.println(sb.toString()); // World Goodbye
        
        // insert() method
        sb.insert(1, " ");
        
        // delete() method
        sb.delete(0, 5);
        
        // reverse() method
        sb.reverse();
        
        // substring() method
        String substring = sb.substring(1, 4);
        
        System.out.println(sb); // Hello
        System.out.println(substring); // loo
        
        // StringBuilder methods can be chained
        sb.append(" World").insert(0, "Java ").delete(7, 10);
        System.out.println(sb);
        
        System.out.println(sb); // Java Hello World

        // StringBuilder methods can be used with other methods
        System.out.println(sb.toString().toUpperCase()); // JAVA HELLO WORLD

        // StringBuilder methods can also be used with primitive types
        int num = 10;
        sb.append(num);
        System.out.println(sb); // Java Hello World 10

        // StringBuilder methods can be used with other objects
        sb.append(new Object());
        System.out.println(sb); // Java Hello World 10 Object@7f0002448060

        // StringBuilder methods can be used with arrays
        int[] arr = {1, 2, 3, 4, 5};
        sb.append(arr);
        System.out.println(sb); // Java Hello World 10 Object@7f0002448060 [I@7f0002448070]

        // reverse a string using function 
        StringBuilder str = new StringBuilder("Hello World");
        for (int i = 0; i < str.length()/2; i++){
            // swap 
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length()-1-i));
            str.setCharAt(str.length()-1-i, temp);
        }    
        System.out.println(str);

    }
}