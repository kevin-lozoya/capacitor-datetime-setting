import { registerPlugin } from '@capacitor/core';

import type { DatetimeSettingPlugin } from './definitions';

const DatetimeSetting = registerPlugin<DatetimeSettingPlugin>('DatetimeSetting', {
  web: () => import('./web').then(m => new m.DatetimeSettingWeb()),
});

export * from './definitions';
export { DatetimeSetting };
