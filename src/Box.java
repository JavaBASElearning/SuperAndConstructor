
public class Box {

	int width; // ������ �������
    int height; // ������ �������
    int depth; // ������� �������
    
     // �����������
   // Box() {
   //     width = 10;
   //     height = 10;
   //     depth = 10;
  //  }
    
    
    
 // ������ �����������
    Box(int w, int h, int d) {
        width = w;
    	height = h;
    	depth = d;
    	
    }	
  
 // ���������� ������ ���� Box
    Box(Box ob) {
        width = ob.width;
    	height = ob.height;
    	depth = ob.depth;
    } 
    
    Box(int i) {
        this(i, i, i); // ���������� Cat(i, i);
    }
    
    
    
    
 // ��������� ����� �������
    int getVolume() {
    	return width * height * depth;
    }
	
	
}
