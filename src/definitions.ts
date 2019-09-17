declare module "@capacitor/core" {
  interface PluginRegistry {
    NavigationBar: NavigationBarPlugin;
  }
}

export interface NavigationBarPlugin {
  setBackgroundColor(options: NavigationBarBackgroundColorOptions): Promise<{value: string}>;
}

export interface NavigationBarBackgroundColorOptions {
  color: string;
}