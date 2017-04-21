# 千萬不要遮掩異常

在catch或finally區段執行過程中，如果發生了異常，會蓋掉原本程式執行時所拋出的錯誤，這樣就找不到罪魁禍首了。

try, catch, finally 區段可以互相嵌套，儘管從它們之中可能拋出多個異常，但只有一個異常可以被傳播到外界。

如果呼叫端需要知道造成失敗的初始原因，解決辦法之一就是，拋出一個包含所有異常的新異常。

如下範例：

```java
// 自訂一個錯誤
public class ReadFileExceptions extends IOException{
	private Vector excVector;
	
	public ReadFileExceptions(Vector v){
		excVector = v;
	}
	public Vector exceptionVector(){
		return excVector;
	}
}
// 執行範例
Vector excVector = new Vector(2);
BufferedReader br = null;
try{
	File f = new File("");
	br = new BufferedReader(f);	
}catch(FileNotFoundException e){
	excVector.add(e);
}finally{
	if(br != null){
		try{
			br.close();
		}catch(IOException e){
			excVector.add(e);
		}		
	}
	if(excVector.size() != 0){
		// 將所有發生的錯誤傳播給呼叫端
		throw new ReadFileExceptions(excVector);
	}
}
```