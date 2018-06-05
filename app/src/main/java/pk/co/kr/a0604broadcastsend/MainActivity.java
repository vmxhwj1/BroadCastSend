package pk.co.kr.a0604broadcastsend;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //BroadCastIntent 만들기
                Intent intent = new Intent();
                //방송을 구별하기 위한 문자열을 생성
                intent.setAction("pk.co.kr");
                //앱이 실행된 적이 없더라고 방송을 송신할 수 있도록 옵션을 설정
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(intent);
            }
        });
    }
}
