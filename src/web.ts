import { WebPlugin } from '@capacitor/core';
import { NavigationBarPlugin, NavigationBarBackgroundColorOptions } from './definitions';

export class NavigationBarWeb extends WebPlugin implements NavigationBarPlugin {
  constructor() {
    super({
      name: 'NavigationBar',
      platforms: ['web']
    });
  }

  async setBackgroundColor(options: NavigationBarBackgroundColorOptions): Promise<{value: string}> {
    console.log('ECHO', options);
    throw Error("not implemented for web");
  }
}

const NavigationBar = new NavigationBarWeb();

export { NavigationBar };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(NavigationBar);
