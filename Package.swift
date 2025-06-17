// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorDatetimeSetting",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorDatetimeSetting",
            targets: ["DatetimeSettingPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "DatetimeSettingPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/DatetimeSettingPlugin"),
        .testTarget(
            name: "DatetimeSettingPluginTests",
            dependencies: ["DatetimeSettingPlugin"],
            path: "ios/Tests/DatetimeSettingPluginTests")
    ]
)