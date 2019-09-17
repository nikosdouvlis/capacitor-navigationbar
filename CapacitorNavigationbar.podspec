
  Pod::Spec.new do |s|
    s.name = 'CapacitorNavigationbar'
    s.version = '0.0.1'
    s.summary = 'Provides methods to customize the navigation bar on crossplatform apps built with capacitor'
    s.license = 'MIT'
    s.homepage = 'git@github.com:nikosdouvlis/capacitor-navigationbar.git'
    s.author = 'Nikos Douvlis'
    s.source = { :git => 'git@github.com:nikosdouvlis/capacitor-navigationbar.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end