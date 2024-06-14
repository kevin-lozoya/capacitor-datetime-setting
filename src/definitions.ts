export interface DatetimeSettingPlugin {
  isAutoTimeEnabled(): Promise<BooleanResult>;
  isAutoTimeZoneEnabled(): Promise<BooleanResult>;
}

export interface BooleanResult {
  value: boolean;
}
