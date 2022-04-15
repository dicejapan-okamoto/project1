package 在庫管理システム;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import 在庫管理システム.SceneMgr1.eScene;

public class data extends JFrame{
//継承
	
	protected enum Update {
		Update_Open,
		Update_Book,
		Update_IT,
		Update_Other
	};
	//Update 列挙型
	
	protected enum Draw {
		Draw_Open,
		Draw_Book,
		Draw_IT,
		Draw_Other
	};
	//Draw 列挙型
	
	public static void main(String[] args) {
		
		Update Update_type = Update.Update_Open;
		//Updateの初期設定
		
		eScene Scene_type = eScene.eScene_Open;
		//eSceneの初期設定
		
		Draw Draw_type = Draw.Draw_Open;
		//Drawの初期設定
		
		System.out.println("在庫管理システム　トップ画面");
		
		data f = new data();
		//data fのインスタンス作成
		
		f.setTitle("在庫管理システム");
		 //ウィンドウ自体の題名を設定
		
		Container c = f.getContentPane();
		//ウィンドウの表示領域の取得
		
		JPanel p = new JPanel();
		//パネルのインスタンスの作成
		
		JLabel l = new JLabel("System's TOP");
		//ウィンドウに出力させる文章を設定
		
		l.setFont(new Font("Arial",Font.PLAIN,30));
		//出力させる文章のフォント設定
		
		l.setForeground(Color.BLUE);
		//文字の色設定	
		
		p.add(l);
		//ラベルをパネルに配置
	    
		c.add(p,BorderLayout.CENTER);
		//パネルをウィンドウの表示領域に配置
		
		f.setVisible(true);
		//ウィンドウを表示
		
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ウィンドウの「閉じる」ボタンを押した時の動作
        
        f.setSize(800,800);
        //ウィンドウのサイズを設定
        
		Scanner scanner = new Scanner(System.in);
         // TODO 自動生成されたメソッド・スタブ
         
		System.out.println("見たいジャンルを入力して下さい");
         
		String thing = scanner.nextLine();
       //String型　thingを入力した値にする（代入）
		
		scanner.close();
		//入力終了する
         
        	 System.out.println(thing + "のデータベースに移ります");
        	 
             if(thing.equals("本")) { 
            	 //Spring型のデータは「==」では正しい結果にならない
            	 
            	 System.out.println("\n本");
            	
            	 Scene_type = eScene.eScene_Book;
            	 //Sceneの更新　ここの「eScene_Book」もエラーを出す
            	 
            	 Update_type = Update.Update_Book;
            	 //Updateの更新
             }
             else if(thing.equals("IT資産")) {
            	 System.out.println("\nIT資産");
            	 
            	 Scene_type = eScene.eScene_IT;
            	 
            	 Update_type = Update.Update_IT;
             }
             else {
            	 System.out.println("\nその他");
            	
            	 Scene_type = eScene.eScene_Other;
            	 
            	 Update_type = Update.Update_Other;
             }
	}
	
}


