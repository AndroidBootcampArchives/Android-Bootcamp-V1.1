package bootcamp.android.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

import bootcamp.android.R;
import bootcamp.android.adapters.ShoppingItemsListAdapter;
import bootcamp.android.models.Product;
import bootcamp.android.repositories.ProductRepository;

public class ShoppingItemsListingActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    ProductRepository productRepository = new ProductRepository();
    final List<Product> products = productRepository.getProducts();
    GridView gridView = (GridView) findViewById(R.id.listofitems);
    ShoppingItemsListAdapter productArrayAdapter = new ShoppingItemsListAdapter(this, (java.util.ArrayList<Product>) products);
    gridView.setAdapter(productArrayAdapter);
    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(ShoppingItemsListingActivity.this, DetailsActivity.class);
        intent.putExtra("title", products.get(i).getTitle());
        startActivity(intent);
      }
    });
  }
}