inherit setuptools
require python-tensorflow.inc

SRC_URI[sha256sum] = "3147f8c60d1f30da23a831bcf732e74b935dcee7c62e4b8b85f0f093030b52c8"

RDEPENDS_${PN}_class-target_append = " \
    ${PYTHON_PN}-subprocess \
"
