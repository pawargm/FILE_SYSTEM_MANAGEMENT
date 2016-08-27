import java.io.File;
import java.util.*;
public class Directory { 

    public static void main(String[] args) {
        Queue<File> queue = new LinkedList<File>();
        LinkedList<String> ll=new LinkedList<String>();
        File root = new File(args[0]);     // root directory
        queue.add(root);
        File directory=null;
        File []files=null;
        int numbers=0;
        int total=0;
        while (!queue.isEmpty()) {
             directory = queue.remove();
             System.out.println("-------------------------DIRECTORY TITLE:"+directory.toString()+"-------------------------");
             files = directory.listFiles();
             if(files!=null)
             {numbers=files.length;}
             total=total+numbers;
             
            if (files != null) {
            	
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) queue.add(files[i]);
                    else System.out.println("Size: "+files[i].length() + ":\t" + files[i]);
                }
            }
            if(files.length==0)
            {
            	
            	
            		ll.add(directory.toString());
            		directory.delete();
            		
            	
            }
            //System.out.println("Number of Files in "+args[0]+":"+files.length);
        }
        
        System.out.println("Number of Files in "+args[0]+":"+total);
        System.out.println("--------List of Numbers Of Deleted Empty Directories-----------");
        for(int i=0;i<ll.size();i++)
        {
        	System.out.println(ll.get(i));
        }
        ll.clear();
        queue.clear();
    }

}

