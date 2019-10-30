# capacitor-navigationbar

Programmatically change the navigation bar color on android devices.

## install
```
npm i capacitor-navigationbar
```

MainActivity.java:
```
import com.nikosdouvlis.navigationbar.NavigationBar;
...
...
add(NavigationBar.class);
```

## import
```
import { NavigationBarPlugin } from 'capacitor-navigationbar';
...
...
const NavigationBar = Plugins.NavigationBar as NavigationBarPlugin;
```

## use
```
NavigationBar.setBackgroundColor({color: '#FF1F1F1F'});
```
