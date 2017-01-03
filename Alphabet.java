import java.io.*;
import java.util.Scanner;
public class Alphabet {
	public void writeAlphabet() throws IOException{
		char[] letters = {
				'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z' };
				RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "rw");
				for (int i = 0; i < letters.length; i++)
				randomFile.writeChar(letters[i]);
				randomFile.close();
	}
	public char readAlphabet(String fileName, int character) throws IOException{
		character = character*2;
		RandomAccessFile randomFile = new RandomAccessFile(fileName, "r");
		randomFile.seek(character);
		char a = randomFile.readChar();
		return a;
	}
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Alphabet a = new Alphabet();
		try {
			a.writeAlphabet();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e){
			}
		System.out.println("What file would you like to read?");
		String file = keyboard.nextLine();
		System.out.println("Which character position would you like to read?");
		int pos = keyboard.nextInt();
		try {
			System.out.println(a.readAlphabet(file, pos));
		} catch (IOException e) {
			e.printStackTrace();
			}
		catch(Exception e){
				}
			}
		}
		


