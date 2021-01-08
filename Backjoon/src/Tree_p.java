import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tree_p {
	
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out)); 
		 
		 StringTokenizer st; 
	        
	        int n = Integer.parseInt(in.readLine()); 
	        int[] parents = new int[n+1];
	        
	        ArrayList<Integer>[] con = new ArrayList[n+1]; 
	        
	        
	        //ArrayList 초기화
	        for(int i=0; i<=n; i++) {
	        	con[i]=new ArrayList<Integer>();
	        	
	        }
	        
	        for(int i=1; i<n; i++) {
	        	st=new StringTokenizer(in.readLine());
	        	int node1=Integer.parseInt(st.nextToken());
	        	int node2=Integer.parseInt(st.nextToken());
	        	
	        	con[node1].add(node2);
	        	con[node2].add(node1); 
	        }
	        
	        //부모 찾는 로직 구현
	        //각 노드를 큐에 저장하고 방문하며 노드에 연결된 노드들을 child로 한다
	        Queue<Integer>q=new LinkedList();
	        q.add(1);
	        
	        while(!q.isEmpty()) {
	        	
	        	int now=q.poll();
	        	
	        	for(int child: con[now]) {
	        		
	        		if(parents[child]!=0){
	        			continue;
	        		}
	        		
	        		parents[child]=now;
	        		q.add(child);
	        		
	        	}
	        }
	        
	        
	        for(int i=2; i<=n; i++) {
	        	
	        	out.write(parents[i]+"\n");
	        }
		 
	        out.flush(); 
	        out.close(); 
	}

}
