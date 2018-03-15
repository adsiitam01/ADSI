
public class ImagenReal implements Imagen {
	private String fileName;

	   public ImagenReal(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }

	   public void display() {
		 System.out.println("Displaying " + fileName);
	   }
}
