// @flow
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
    +getConstants: () => {|
        language: string
    |},
    +getLanguage: (callback: (_: string, language: string) => void) => void
}

export default (TurboModuleRegistry.get<Spec>(
'ReactLocalization'
): ?Spec);