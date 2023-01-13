import { platformNativeScript, registerElement, runNativeScriptAngularApp } from '@nativescript/angular';

import { AppModule } from './app/app.module';
import { registerJetpackCompose, ComposeDataDriver, JetpackCompose } from '@nativescript/jetpack-compose';

registerElement('JetpackCompose', () => JetpackCompose);
// A. You can generate types for your own Compose Provider with 'ns typings android --aar {path/to/{name}.aar}'
// B. Otherwise you can ignore by declaring the package resolution path you know you provided
declare var com;
registerJetpackCompose('dynamicIsland', (view) => new ComposeDataDriver(new com.sinasamaki.dynamicisland.IslandView(), view));

runNativeScriptAngularApp({
  appModuleBootstrap: () => platformNativeScript().bootstrapModule(AppModule),
});

