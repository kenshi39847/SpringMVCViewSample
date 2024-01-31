package com.example.demo.controller;

/*
クライアントからURL「https://localhost:8080/hello/view」がGETメソッドで送信されると、
「HelloViewController」クラスの「helloView」メソッドが呼ばれる。
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//インスタンス生成アノテーションで@Controllerはクライアントとのデータ入出力を制御するアプリケーション層のコントローラに付与する
//リクエストハンドラメソッドの戻り値をビュー名にすることで、テンプレートエンジンのビューがレスポンスのHTMLを生成する
@Controller
//コントローラのリクエストハンドラメソッドとURLをマッピングするには@RequestMappingアノテーションをクラスまたはメソッドに付与する
//@RequestMappingアノテーションは様々な属性を指定できるが、基本的には「value」、「method」を指定する
@RequestMapping("hello")
public class HelloViewController {
	
	//@GetMappingは@RequestMappingのGETリクエスト用のアノテーションで、使用することで記述の省略と可読性の向上に繋がる
	//「value」属性は使用できるが、「method」属性はない。
	@GetMapping("view")
	public String helloView() {
		//戻り値はビュー名を返す
		return "hello";
	}

}
