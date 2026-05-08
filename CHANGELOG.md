# Changelog

## 0.10.0 (2026-05-08)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/jd-st/jd-project-java/compare/v0.9.0...v0.10.0)

### Features

* **client:** improve logging ([20cfeb2](https://github.com/jd-st/jd-project-java/commit/20cfeb29ff075e9c37332a539603252dc61e0696))


### Chores

* redact api-key headers in debug logs ([c37b680](https://github.com/jd-st/jd-project-java/commit/c37b680692aef983416acbf7b1c23b51240ac61a))

## 0.9.0 (2026-05-06)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/jd-st/jd-project-java/compare/v0.8.0...v0.9.0)

### Features

* **client:** support proxy authentication ([e18db2c](https://github.com/jd-st/jd-project-java/commit/e18db2c1e2710a65911f05f9da749c654e2a341d))


### Performance Improvements

* **client:** create one json mapper ([9b3e1bd](https://github.com/jd-st/jd-project-java/commit/9b3e1bde3a01213d95712a1f7e18de3af8e6836e))

## 0.8.0 (2026-05-05)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/jd-st/jd-project-java/compare/v0.7.0...v0.8.0)

### Features

* **client:** more robust error parsing ([e22d45a](https://github.com/jd-st/jd-project-java/commit/e22d45a10a9696318d70dd40918e81545e6ae96d))


### Chores

* remove duplicated dokka setup ([b940376](https://github.com/jd-st/jd-project-java/commit/b94037613e52a978537182f0df02592501f9d407))


### Documentation

* clarify forwards compat behavior ([264a08e](https://github.com/jd-st/jd-project-java/commit/264a08e9775d4ff41049ad6781ba25463a92079e))

## 0.7.0 (2026-04-28)

Full Changelog: [v0.6.2...v0.7.0](https://github.com/jd-st/jd-project-java/compare/v0.6.2...v0.7.0)

### Features

* support setting headers via env ([74c1d64](https://github.com/jd-st/jd-project-java/commit/74c1d6461f891e8e972114be43b41f4d847d8a00))


### Chores

* **ci:** skip lint on metadata-only changes ([52a10c0](https://github.com/jd-st/jd-project-java/commit/52a10c062fb31a4a7e743c72153d7a9b349fb923))
* **internal:** bump ktfmt ([d97b9d7](https://github.com/jd-st/jd-project-java/commit/d97b9d74f1f359aa679a75f20177d54976a09d8b))
* **internal:** codegen related update ([472c311](https://github.com/jd-st/jd-project-java/commit/472c311b9415ba2c2554fc24bc77efc907453ad7))
* **internal:** update gitignore ([08b6010](https://github.com/jd-st/jd-project-java/commit/08b60108e6ea5c3b426aa1bc38a37e19752b174b))

## 0.6.2 (2026-03-18)

Full Changelog: [v0.6.1...v0.6.2](https://github.com/jd-st/jd-project-java/compare/v0.6.1...v0.6.2)

### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([196b1fe](https://github.com/jd-st/jd-project-java/commit/196b1feb4852788fc87319bbf38461727ddbc65c))


### Chores

* **internal:** tweak CI branches ([9e5cbb3](https://github.com/jd-st/jd-project-java/commit/9e5cbb3ee6eb010984351bb13cebecb5c671ab3c))
* **internal:** update retry delay tests ([c7ddfb1](https://github.com/jd-st/jd-project-java/commit/c7ddfb1e51bc985bc90e85080e07cf41e8e68434))

## 0.6.1 (2026-03-11)

Full Changelog: [v0.6.0...v0.6.1](https://github.com/jd-st/jd-project-java/compare/v0.6.0...v0.6.1)

### Bug Fixes

* **client:** incorrect `Retry-After` parsing ([5889171](https://github.com/jd-st/jd-project-java/commit/5889171616f6df1235dc68e5461bdec82d755bfd))


### Chores

* **ci:** skip uploading artifacts on stainless-internal branches ([2230997](https://github.com/jd-st/jd-project-java/commit/2230997671cb7c0def93a39caadb90712e43c9d6))
* drop apache dependency ([42b892c](https://github.com/jd-st/jd-project-java/commit/42b892c43c93be5a187f19ed07e450fcac4a1be4))
* **internal:** bump palantir-java-format ([e591643](https://github.com/jd-st/jd-project-java/commit/e591643629df410677d0557bbbf5260d0b207794))
* **internal:** codegen related update ([59fb4ff](https://github.com/jd-st/jd-project-java/commit/59fb4ff92e4b9d3e98e3ac52f182c148b0dcb981))
* **internal:** codegen related update ([f18d32a](https://github.com/jd-st/jd-project-java/commit/f18d32ad069f166c5f6cd3dcc46c20a0792cb913))
* **internal:** expand imports ([fcb247b](https://github.com/jd-st/jd-project-java/commit/fcb247b172b234d7c672bdf480eba41515ba7f0f))
* **internal:** remove mock server code ([d7ec4fb](https://github.com/jd-st/jd-project-java/commit/d7ec4fb84cce99c0611e299853948fa9d27753f0))
* make `Properties` more resilient to `null` ([1b1dda0](https://github.com/jd-st/jd-project-java/commit/1b1dda074a04f162c6ba2bc62738126edda34cf7))
* update mock server docs ([0b72c3c](https://github.com/jd-st/jd-project-java/commit/0b72c3c8d67dae20c089205558d94ff3fb6a71b3))
* update placeholder string ([2352c92](https://github.com/jd-st/jd-project-java/commit/2352c922609e15f6ceeb937adcdef1aee6e9e97e))

## 0.6.0 (2026-02-19)

Full Changelog: [v0.5.1...v0.6.0](https://github.com/jd-st/jd-project-java/compare/v0.5.1...v0.6.0)

### Features

* **client:** add connection pooling option ([22a15e5](https://github.com/jd-st/jd-project-java/commit/22a15e59d99482706b76cad8d0548284854e76f4))
* **client:** add more convenience service method overloads ([2a10a5f](https://github.com/jd-st/jd-project-java/commit/2a10a5fc9a4e8de448bd6d690e122a27465543e2))


### Chores

* **ci:** upgrade `actions/github-script` ([02fde7d](https://github.com/jd-st/jd-project-java/commit/02fde7d4db344415d52e8606b1b7baee63e89981))
* **internal:** allow passing args to `./scripts/test` ([88019da](https://github.com/jd-st/jd-project-java/commit/88019daac06bc38d456e757f07253cae1ab8cc93))
* **internal:** codegen related update ([ebc761d](https://github.com/jd-st/jd-project-java/commit/ebc761dc46405a9d900eedd7cb157da315b7b04a))
* **internal:** make `OkHttp` constructor internal ([f7c5cab](https://github.com/jd-st/jd-project-java/commit/f7c5caba9dcc5a459dfef2603ca901cb2fbda030))
* **internal:** update `TestServerExtension` comment ([4664ea6](https://github.com/jd-st/jd-project-java/commit/4664ea6298f292e24b8c958fb131b8674d5c46fe))
* **internal:** upgrade AssertJ ([2b385e4](https://github.com/jd-st/jd-project-java/commit/2b385e49f0b19b0362177b8d8395e402b6bcdf89))

## 0.5.1 (2026-01-23)

Full Changelog: [v0.5.0...v0.5.1](https://github.com/jd-st/jd-project-java/compare/v0.5.0...v0.5.1)

### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([f1d7109](https://github.com/jd-st/jd-project-java/commit/f1d7109e8c4d4252904d64b002a896a1de439131))
* **tests:** add missing query/header params ([4f40e73](https://github.com/jd-st/jd-project-java/commit/4f40e7368f5639221e85af92f7d359f55485a101))


### Chores

* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([309b895](https://github.com/jd-st/jd-project-java/commit/309b8954b28153f2c921bab191614f497d9873e6))

## 0.5.0 (2026-01-22)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/jd-st/jd-project-java/compare/v0.4.0...v0.5.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([4287841](https://github.com/jd-st/jd-project-java/commit/4287841c71d815e3a5c0122827cb4165b856da56))


### Chores

* **internal:** update maven repo doc to include authentication ([e574f43](https://github.com/jd-st/jd-project-java/commit/e574f43e557a98518eb2a6ad2de0c028e5d7ebe7))

## 0.4.0 (2026-01-20)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/jd-st/jd-project-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** api update ([4bb68a1](https://github.com/jd-st/jd-project-java/commit/4bb68a12916910158b68138f143efc42f6e3844e))

## 0.3.0 (2026-01-20)

Full Changelog: [v0.2.1...v0.3.0](https://github.com/jd-st/jd-project-java/compare/v0.2.1...v0.3.0)

### Features

* **api:** manual updates ([b28f477](https://github.com/jd-st/jd-project-java/commit/b28f47717c156db9c000b6062e6defa53ec76655))


### Chores

* **ci:** upgrade `actions/setup-java` ([48739b3](https://github.com/jd-st/jd-project-java/commit/48739b3e6ac8da2b93f8a46ff7c0a87e0177334a))

## 0.2.1 (2026-01-17)

Full Changelog: [v0.2.0...v0.2.1](https://github.com/jd-st/jd-project-java/compare/v0.2.0...v0.2.1)

### Bug Fixes

* **client:** disallow coercion from float to int ([0ae39c6](https://github.com/jd-st/jd-project-java/commit/0ae39c6861b0a082347edca22a0ed2d11e3ad4a5))
* **client:** fully respect max retries ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* **client:** send retry count header for max retries 0 ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* date time deserialization leniency ([b285086](https://github.com/jd-st/jd-project-java/commit/b285086b39d58f33df361d131b8ce575c37940a7))


### Chores

* **internal:** depend on packages directly in example ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* **internal:** improve maven repo docs ([ffc686e](https://github.com/jd-st/jd-project-java/commit/ffc686e416b3eb4bab8ebd0c9d85660aacbc3723))
* **internal:** update `actions/checkout` version ([f20fc7c](https://github.com/jd-st/jd-project-java/commit/f20fc7cd694fe2fe660a99208c8c28ad178c0800))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/jd-st/jd-project-java/issues/3240) in tests ([b285086](https://github.com/jd-st/jd-project-java/commit/b285086b39d58f33df361d131b8ce575c37940a7))

## 0.2.0 (2026-01-16)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/jd-st/jd-project-java/compare/v0.1.0...v0.2.0)

### Features

* **client:** allow configuring dispatcher executor service ([aaabfd6](https://github.com/jd-st/jd-project-java/commit/aaabfd68b61990d7d5ecfdbd9f90e16b3c3965f7))


### Chores

* **internal:** clean up maven repo artifact script and add html documentation to repo root ([6e3b409](https://github.com/jd-st/jd-project-java/commit/6e3b40953b96f397e6881d4f9c01918c7ff6debe))
* **internal:** support uploading Maven repo artifacts to stainless package server ([65b3d32](https://github.com/jd-st/jd-project-java/commit/65b3d327c585566c3325211117798763bd440b46))

## 0.1.0 (2026-01-06)

Full Changelog: [v0.0.2...v0.1.0](https://github.com/jd-st/jd-project-java/compare/v0.0.2...v0.1.0)

### Features

* **api:** manual updates ([19f16bb](https://github.com/jd-st/jd-project-java/commit/19f16bb27e754f41cd310a0a86908b59c51499aa))

## 0.0.2 (2026-01-06)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/jd-st/jd-project-java/compare/v0.0.1...v0.0.2)

### Chores

* configure new SDK language ([efb15c6](https://github.com/jd-st/jd-project-java/commit/efb15c651724c0a597902cf57a28498f3307259d))
* update SDK settings ([494582d](https://github.com/jd-st/jd-project-java/commit/494582d9d6da3e3c36ced6dbc01d4bc6385d4ea5))
