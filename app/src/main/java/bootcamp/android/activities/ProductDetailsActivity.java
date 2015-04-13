package bootcamp.android.activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidplugins.Callback;
import androidplugins.imagefetcher.ImageFetcher;
import bootcamp.android.R;
import bootcamp.android.fragments.ProductDetailsFragment;
import bootcamp.android.models.Product;

import static bootcamp.android.constants.Constants.*;


public class ProductDetailsActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.product_details_container);

    Bundle extraArguments = getIntent().getExtras();
    ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
    productDetailsFragment.setArguments(extraArguments);
    getSupportFragmentManager().beginTransaction().add(R.id.product_details_container, productDetailsFragment, "products_fragment").commit();
  }


}