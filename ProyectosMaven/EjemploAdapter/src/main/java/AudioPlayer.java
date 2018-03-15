
public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter; 

	   public void play(String audioType, String fileName) {		

	      //Permite crear y leer archivos Mp3
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	      
	      //Media adpater permite leer otros archivos
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      
	      else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }   
}
