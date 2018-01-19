
apply { plugin("kotlin") }

dependencies {
    compile(project(":compiler:util"))
    compileOnly(intellijCoreDep()) { includeJars("intellij-core") }
    compileOnly(intellijDep()) { includeJars("guava", "android-base-common", rootProject = rootProject) }
    compileOnly(intellijPluginDep("gradle")) { includeJars("gradle-tooling-api", rootProject = rootProject) }
    compileOnly(intellijPluginDep("android")) { includeJars("android", "android-common", "common", "sdk-common", rootProject = rootProject) }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

