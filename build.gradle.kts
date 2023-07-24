plugins {
    id("version-catalog")
    id("maven-publish")
}

catalog {
    versionCatalog {
        from(files("libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("versionCatalog") {
            groupId = "de.meisign"
            artifactId = "gradle-version-catalog-publish-example"
            version = "0.0.1"
            from(components["versionCatalog"])
        }
    }
}
