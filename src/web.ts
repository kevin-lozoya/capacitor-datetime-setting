import { WebPlugin } from '@capacitor/core';

import type { BooleanResult, DatetimeSettingPlugin } from './definitions';

export class DatetimeSettingWeb extends WebPlugin implements DatetimeSettingPlugin {
  async isAutoTimeEnabled(): Promise<BooleanResult> {
    console.warn('isAutoTimeEnabled is not available on web');
    return { value: false };
  }

  async isAutoTimeZoneEnabled(): Promise<BooleanResult> {
      console.warn('isAutoTimeZoneEnabled is not available on web');
      return { value: false };
  }
}
