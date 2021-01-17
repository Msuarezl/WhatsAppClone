package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.whatsappclone.databinding.ActivityPrincipalBinding;
import com.example.whatsappclone.menu.CallsFragment;
import com.example.whatsappclone.menu.CameraFragment;
import com.example.whatsappclone.menu.ChatsFragment;
import com.example.whatsappclone.menu.StatusFragment;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {
    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_principal);
        setUpWithViewPager(binding.viewPager);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        setSupportActionBar(binding.toolbar);

    }

    private void setUpWithViewPager(ViewPager viewPager){
        Principal.SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment(),"");
        adapter.addFragment(new ChatsFragment(),"Chats");
        adapter.addFragment(new StatusFragment(),"Estados");
        adapter.addFragment(new CallsFragment(),"Llamadas");
        viewPager.setAdapter(adapter);
    }
    private static class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item)
    {
        int id = item.getItemId();

        switch (id){
            case R.id.menu_search : Toast.makeText(Principal.this, "Busqueda", Toast.LENGTH_SHORT).show();break;
            case R.id.menu_options : Toast.makeText(Principal.this, "Opciones", Toast.LENGTH_SHORT).show();break;
        }

        return super.onOptionsItemSelected(item);

    }
}