package bootcamp.android.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import bootcamp.android.R;

public class DetailsActivity extends Activity{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.details);
    String title = getIntent().getStringExtra("title");
    ((TextView)findViewById(R.id.title)).setText(title);
  }
}
